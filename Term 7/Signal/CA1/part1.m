clc
clear
close all

t = 0:0.001:20;
xa = 1 + cos(4 * pi * t) + exp(i * t) .* (cos(2 * pi * t) + cos(pi * t));

figure
subplot(2,1,1)       % add first plot in 2 x 1 grid
plot(t,abs(xa))
title('magnitude of x signal')

subplot(2,1,2)       % add second plot in 2 x 1 grid
plot(t,angle(xa))
title('phase of x signal')
print('x','-dpng')

h1 = exp(t);
h2 = exp(-t);

figure
subplot(2,1,1)       % add first plot in 2 x 1 grid
plot(t,abs(h1))
title('magnitude of h1 signal')

subplot(2,1,2)       % add second plot in 2 x 1 grid
plot(t,angle(h1))
title('magnitude of h1 signal')
print('h1','-dpng')

figure
subplot(2,1,1)       % add first plot in 2 x 1 grid
plot(t,abs(h2))
title('magnitude of h2 signal')

subplot(2,1,2)       % add second plot in 2 x 1 grid
plot(t,angle(h2))
title('magnitude of h2 signal')
print('h2','-dpng')


y = conv(xa , h1 , 'same');

figure
subplot(2,1,1)       % add first plot in 2 x 1 grid
plot(t,abs(y))
title('magnitude of x * h1 signal')

subplot(2,1,2)       % add second plot in 2 x 1 grid
plot(t,angle(y))
title('magnitude of x * h1 signal')
print('x * h1','-dpng')


y = conv(xa , h2 , 'same');

figure
subplot(2,1,1)       % add first plot in 2 x 1 grid
plot(t,abs(y))
title('magnitude of x * h2 signal')

subplot(2,1,2)       % add second plot in 2 x 1 grid
plot(t,angle(y))
title('magnitude of x * h2 signal')
print('x * h2','-dpng')