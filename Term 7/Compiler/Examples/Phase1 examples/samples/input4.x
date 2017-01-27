type Operator as <int*int->int>;

int pow(int, int);
int min(int, int);

<int*int->int> select_operator(op : string(3), pow : <int*int->int>, min: Operator) {
	if (op == ['a','d','d'])
		return adder;
	else if (op == "sub")
		return subtractor;
	else
		return nil;
}

void main() {
}

int min(n1 : int, n2 :int) {
	if (n1 < n2)
		return n1;
	return n2;
}

int pow(n1 : int, n2 :int) {
	int result = 1;

	while(n2 != 0) {
		result = result * n1;
		n2 = n2 -1;
	}

	return result;
}
