int str2int_3digit(str : string(3));
int str2int_2digit(str : string(2));

void main() {
	write("Enter your height in centimeters: ");
	int height = str2int_3digit(read(3));

	write("Enter your weight in kilograms: ");
	int weight = str2int_2digit(read(2));

	int bmi = wight * 100 / (height * height);

	if (bmi < 1850)
		write("Underweight.");
	else if ((bmi > 1850 || bmi == 1850) && bmi < 2499)
		write("Normal weight.");
	else if (bmi > 2498 && bmi < 3000)
		write("Overweight.");
	else if (bmi > 30)
		write("You are good.");

	return;
}

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
	else if (digit == '5')
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

int str2int_3digit(str : string(3)) {
	int retval = 0;

	foreach(char c in str) {
		retval = retval * 10 + char2int(c);
	}

	if (str#0 == '-')
		retval = -retval;

	return retval;
}

int str2int_2digit(str : string(2)) {
	int retval = 0;

	foreach(char c in str) {
		retval = retval * 10 + char2int(c);
	}

	if (str#0 == '-')
		retval = -retval;

	return retval;
}
