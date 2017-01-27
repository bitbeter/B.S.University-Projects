clear;
clc;
close all;

[voice , Fs] = audioread('sound.wav' , 'double');
n1 = 0.5*Fs;
a1 = 0.5;

eco_voice = voice;
% sound(voice ,Fs);

for i = n1 + 1 : length(voice)
    eco_voice(i) = voice(i) + a1*voice(i-n1);
end

audiowrite('eco_voice.wav' , eco_voice , Fs)

reverse_filter = [ 1 zeros(1 , n1 - 1) ];
factor_ = 5;
for i = 1 : factor_
    temp = reverse_filter;
    reverse_filter = [ temp ((-1)^i)*(a1^i) zeros(1 , n1 - 1) ];
end

uneco_voice = conv(eco_voice , reverse_filter );

figure
plot(reverse_filter)

figure
subplot(3,1,1)
plot(eco_voice)
title('org')
axis([0 inf -1 1])

subplot(3,1,2)
plot(eco_voice)
title('with echo')
axis([0 inf -1 1])

subplot(3,1,3)
plot(uneco_voice)
title('with unecho')
axis([0 inf -1 1])
print('part1' , '-dpng');

audiowrite('uneco_voice.wav' , uneco_voice , Fs)
% sound(uneco_voice ,Fs)
