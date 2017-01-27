function [ eco ] = eco_creator( voice , delay , a )
    eco = circshift(voice , delay);
    eco(1:delay) = zeros(1,delay);
    eco = a * eco;
end

