type Position;
type Circle as [ position : Position , typeName : string(123)];
type Position as [x : int , y : int];

type Car;
type TCost as <Car*int->int>;
type TTime as <Car*int->int>;
type Car as [fuel_type: char, a : list(12) of ali , typeName: string(6), model : string(4), max_speed: int, gas_mileage: int, trip_cost: TCost, trip_time: TTime, annual_fuel_cost: <Car->int>];

int h = 0;
int globalVar = h = 14 , k = 123;

<int*int->int> select_operator(op : string(2), pow : <int*int->int>, min: Operator) {
	if (op == ['a','d','d'])
		return adder;
	else if (op == "sub")
		return subtractor;
	else
		return nil;

		;

		<<int*int->int>->int> f2; // : int*int->int, out: int
    <int*int-><int->int>> f3; // in: int*int, out: int->int
}

int function(int , Circle);

int char2int(c:char) {
	if (digit == '0')
		return 0;
	else if (digit == '1')
		return 1;
	else if (digit == '2')
		return 2;
	else if (digit == '3')
		return 3;
	else if (digit == '4')
		return 4;
	else if (digit == '5')// :)
		return 5;
	else if (digit == '6')
		return 6;
	else if (digit == '7')
		return 7;
	else if (digit == '8')
		return 8;
	else if (digit == '9')
		return 9;
	else
		return 0;
}

int function(a : int , b : Circle){

    /*this
	is
	not
	imoprtant
	at
	all
	*/
	;
    namedType ig = h = 0;
    b = r;
    write("This is test #1: ");
}

int function2(a : int , b : Circle){
    function(1 , [100 , 123]);
    b = a + ((2 + a) /  ( r ) * 3 * (3 + 2)) ; // asdasdasdasdasdasd
    return a < 3;
}

void main(){

    salam()().func1()(1 , 2)#2().func2()();

    while(true){
    a = h;
    break;
    }

    foreach(int a in b){
    a = h;
    break;
    {
        a = b;
        { ghasd.f();{}}
    }
    }

    Car HondaCRZ = ['F', "HndCRZ", "2016", 209, 36, trip_cost_calculator, trip_time_calculator, annual_fuel_cost];

	Car BMWi3 = ['E', "BMW i3", "2016", 150, 0, nil, nil, nil];

	BMWi3.trip_cost = trip_cost_calculator;
	BMWi3#6 = trip_time_calculator;
	BMWi3#7 = annual_fuel_cost;

	Car ToyotaPrius = ['F', "TOYPRI", "2016", 180, 56, nil, nil, annual_fuel_cost];

	ToyotaPrius#5 = BMWi3.trip_cost;
	ToyotaPrius.trip_time = HondaCRZ#6;

	if (HondaCRZ.max_speed < ToyotaPrius.max_speed && BMWi3.max_speed < ToyotaPrius.max_speed) {
		write("Fastest:");
		write(ToyotaPrius.typeName);
	}

	((a.b)#3)().g#3.a;

	int avgTripTime = (HondaCRZ.trip_cost(HondaCRZ, 100)
					 + BMWi3.trip_cost(BMWi3, 100)
					 + ToyotaPrius.trip_cost(ToyotaPrius, 100)) / 3;

    namedType ig = h = 0;
    if(h == 2)
        write("asdasd").asd(123 , 12);
    else
        if (asf = "123")
            ((a.b).f)#3 = qwe;
        else {
            if(123 == 123)
                if(123) a = 1;
                else
                    if(123) a = 2;
        }

    /*this

    /*this
	is
	not
	imoprtant
	at
	all
	*/


    if (a == 2)
        if (yechizi)
          a.f();
        else
          a.f();
        if (a == 1)
            ;
        else
            a = 2;

    while (112 == asd){ a = a + 1;
        if (digit == '0')
		return 0;
	else if (digit == '1')
		return 1;
	else if (digit == '2')
		return 2;
	else if (digit == '3')
		return 3;
	else if (digit == '4')
		return 4;
	else if (digit == '5')// :)
		return 5;
	else if (digit == '6')
		return 6;
	else if (digit == '7')
		return 7;
	else if (digit == '8')
		return 8;
	else if (digit == '9')
		return 9;
	else
		return 0;
    }

    Object o;
    o.a(2)(3)(4).a(5)(6 , h)#3;

    foreach(< int * Circle -> void> asb in [ ptf1, ptf2]) asb(qwe);

    write("Enter your height in centimeters: ");
	int height = str2int_3digit(read(3));

	write("Enter your weight in kilograms: ");
	int weight = str2int_2digit(read(2));

	int bmi = wight * 100 / (height * height);

    int c = max(a, b, 2, [1, 2], "salam");

	if (bmi < 1850)
		write("Underweight.");
	else if ((bmi > 1850 || bmi == 1850) && bmi < 2499)
		write("Normal weight.");
	else if (bmi > 2498 && bmi < 3000)
		write("Overweight.");
	else if (bmi > 30)
		write("You are good.");


    a()(askdlaksd , kjasdljasdl)(123,123);

    <int*[<int*char->[char, char]>, int]*int*char-><<void->void>->void>> fuck;

    return a;
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


int str2int_3digit(str : string(2)) {
	int retval = 0;

	foreach(char c in str) {
		retval = retval * 10 + char2int(c);
	}

	if (str#0 == '-')
		retval = -retval;

	return retval;
}

int str2int_2digit(str : string(9)) {
	int retval = 0;

	foreach(char c in str) {
		retval = retval * 10 + char2int(c);
		if (str#0 == '-')
            retval = -retval;
        else if(a);
        else break;
	}

	if (str#0 == '-')
		retval = -retval;
    else if(a);
    else;

	return retval;
}


int trip_cost_calculator(c : Car, distance: int) {
	int cost;

	cost = c.gas_mileage * distance;

	return cost;
}

int trip_time_calculator(c : Car, distance: int) {
	int cost;

	cost = c.max_speed * distance;

	return cost;
}

int annual_fuel_cost(c : Car) {
	return c.gas_mileage * 15000;
}