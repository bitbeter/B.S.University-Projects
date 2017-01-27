type Car;
type TCost as <Car*int->int>;
type TTime as <Car*int->int>;
type Car as [fuel_type: char, typeName: string(6), model : string(4), max_speed: int, gas_mileage: int, trip_cost: TCost, trip_time: TTime, annual_fuel_cost: <Car->int>];


void main() {
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

	int avgTripTime = (HondaCRZ.trip_cost(HondaCRZ, 100)
					 + BMWi3.trip_cost(BMWi3, 100)
					 + ToyotaPrius.trip_cost(ToyotaPrius, 100)) / 3;
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
