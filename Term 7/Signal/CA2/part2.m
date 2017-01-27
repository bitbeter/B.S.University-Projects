clear;
clc;
close all;
[voice , Fs] = audioread('sound.wav' , 'double');

n1 = 0.5*Fs;
a1 = 0.5;

eco_voice = voice;
for i = n1 + 1 : length(voice)
    eco_voice(i) = voice(i) + a1*voice(i-n1);
end

NUM = 1;
DEN = [1 zeros(1 , n1 - 1) a1];

filt(NUM , DEN)
pic = freqz(NUM , DEN);

figure
subplot(2,1,1)
plot(abs(pic));
title('magnitude')

subplot(2,1,2)
plot(angle(pic));
title('angle')
print('part2-filter1' , '-dpng');

filterd_voice = filter(NUM , DEN , eco_voice);

audiowrite('part2_uneco_voice.wav' , filterd_voice , Fs)

%%%%% 9
eco_voice2 = voice;

n1 = 0.3*Fs;
a1 = 0.5;
for i = n1 + 1 : length(voice)
    eco_voice2(i) = voice(i) + a1*voice(i-n1);
end
n2 = 0.5*Fs;
a2 = 0.3;
temp = eco_voice2;
for i = n2 + 1 : length(voice)
    eco_voice2(i) = temp(i) + a2*voice(i-n2);
end

audiowrite('eco_voice2.wav' , eco_voice2 , Fs)

NUM = 1;
DEN = [1 zeros(1 , n1 - 1) a1 zeros(1,n2 - n1 - 1) a2];
filterd_voice2 = filter(NUM , DEN , eco_voice2);

audiowrite('part2_uneco_voice2.wav' , filterd_voice2 , Fs)
sound(filterd_voice2 , Fs);