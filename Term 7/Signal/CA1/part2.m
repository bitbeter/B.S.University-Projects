clc
clear
close all

t = 0:0.01:20;

fileID = fopen('accel_data.txt');
c = textscan(fileID , '%f%f%f%f');
x = c{1,1};
y = c{1,2};
z = c{1,3};
w = c{1,4};

figure
subplot(4,1,1)
plot(x)
title('x signal')

subplot(4,1,2)
plot(y)
title('y signal')

subplot(4,1,3)
plot(z)
title('z signal')

subplot(4,1,4)
plot(w)
title('w signal')
print('5' , '-dpng')

figure
subplot(4,1,1)
plot(x)
title('x signal')

ma_length = 10;
h = 0.1 * ones(1 , ma_length);
result = conv (x , h , 'same');

subplot(4,1,2)
plot(result)
title('x with ma_length = 10 signal')


ma_length = 100;
h = 0.1 * ones(1 , ma_length);
result = conv (x , h , 'same');

subplot(4,1,3)
plot(result)
title('x with ma_length = 100 signal')


ma_length = 1000;
h = 0.1 * ones(1 , ma_length);
result = conv (x , h , 'same');

subplot(4,1,4)
plot(result)
title('x with ma_length = 1000 signal')

print ('moving averages x','-dpng')







figure
subplot(4,1,1)
plot(y)
title('y signal')

ma_length = 10;
h = 0.1 * ones(1 , ma_length);
result = conv (y , h , 'same');

subplot(4,1,2)
plot(result)
title('y with ma_length = 10 signal')


ma_length = 100;
h = 0.1 * ones(1 , ma_length);
result = conv (y , h , 'same');

subplot(4,1,3)
plot(result)
title('y with ma_length = 100 signal')


ma_length = 1000;
h = 0.1 * ones(1 , ma_length);
result = conv (y , h , 'same');

subplot(4,1,4)
plot(result)
title('y with ma_length = 1000 signal')

print ('moving averages y','-dpng')








figure
subplot(4,1,1)
plot(z)
title('z signal')

ma_length = 10;
h = 0.1 * ones(1 , ma_length);
result = conv (z , h , 'same');

subplot(4,1,2)
plot(result)
title('z with ma_length = 10 signal')


ma_length = 100;
h = 0.1 * ones(1 , ma_length);
result = conv (z , h , 'same');

subplot(4,1,3)
plot(result)
title('z with ma_length = 100 signal')


ma_length = 1000;
h = 0.1 * ones(1 , ma_length);
result = conv (z , h , 'same');

subplot(4,1,4)
plot(result)
title('z with ma_length = 1000 signal')

print ('moving averages z','-dpng')

fclose(fileID);
