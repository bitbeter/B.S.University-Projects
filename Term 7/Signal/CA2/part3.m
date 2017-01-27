
[voice , Fs] = audioread('sound-nois.wav' , 'double');

% sound(voice)

Nsamps = length(voice);
y_fft = abs(fft(voice));
y_fft = y_fft(1:Nsamps/2);
f = Fs*(0:Nsamps/2-1)/Nsamps;

figure
plot(f, y_fft)
xlim([0 Fs / 2])
xlabel('Frequency (Hz)')
ylabel('Amplitude')
title('Frequency Response')
print('part3-HW-Noisy-Sound' , '-dpng');

SigFilter = SigFilter();
SigFilter2 = SigFilter2();
SigFilter3 = SigFilter3();
SigFilter4 = SigFilter4();
filtered_signal = filter(SigFilter , voice);
filtered_signal = filter(SigFilter2 , filtered_signal);
filtered_signal = filter(SigFilter3 , filtered_signal);
filtered_signal = filter(SigFilter4 , filtered_signal);

Nsamps = length(filtered_signal);
y_fft = abs(fft(filtered_signal));
y_fft = y_fft(1:Nsamps/2);
f = Fs*(0:Nsamps/2-1)/Nsamps;

% sound(filtered_signal , Fs)

figure
plot(f, y_fft)
xlim([0 Fs / 2])
xlabel('Frequency (Hz)')
ylabel('Amplitude')
title('Filtered Frequency Response')
print('part3-HW-Filtered-Sound' , '-dpng');

chavski = chavski();
filtered_signal = filter(chavski , voice);
Nsamps = length(filtered_signal);
y_fft = abs(fft(filtered_signal));
y_fft = y_fft(1:Nsamps/2);
f = Fs*(0:Nsamps/2-1)/Nsamps;

figure
plot(f, y_fft)
xlim([0 Fs / 2])
xlabel('Frequency (Hz)')
ylabel('Amplitude')
title('Filtered Frequency Response')
print('part3-HW-CHAVSKI-Filtered-Sound' , '-dpng');
audiowrite('finalsound.wav' , filtered_signal, Fs)