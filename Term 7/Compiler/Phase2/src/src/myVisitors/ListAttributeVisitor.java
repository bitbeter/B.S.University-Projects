package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import src.XParts.ListAttribute;
import src.XParts.Type;

/**
 * Created by hasan on 12/11/2016 AD.
 */
public class ListAttributeVisitor extends XBaseVisitor<ListAttribute> {
    TypeVisitor typeVisitor;

    public ListAttributeVisitor(TypeVisitor typeVisitor) {
        this.typeVisitor = typeVisitor;
    }

    @Override
    public ListAttribute visitListAttribute(XParser.ListAttributeContext ctx) {
        Type type = ctx.type().accept(typeVisitor);
        if (ctx.Identifier() != null)
            return new ListAttribute(ctx.Identifier().getText(), type);
        return new ListAttribute(null, type);
    }
}
