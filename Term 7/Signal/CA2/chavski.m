function Hd = chavski
%CHAVSKI Returns a discrete-time filter object.

% MATLAB Code
% Generated by MATLAB(R) 8.3 and the Signal Processing Toolbox 6.21.
% Generated on: 03-Jan-2017 06:35:51

% Chebyshev Type I Lowpass filter designed using FDESIGN.LOWPASS.

% All frequency values are in Hz.
Fs = 8000;  % Sampling Frequency

Fpass = 2200;        % Passband Frequency
Fstop = 2600;        % Stopband Frequency
Apass = 2;           % Passband Ripple (dB)
Astop = 7;           % Stopband Attenuation (dB)
match = 'passband';  % Band to match exactly

% Construct an FDESIGN object and call its CHEBY1 method.
h  = fdesign.lowpass(Fpass, Fstop, Apass, Astop, Fs);
Hd = design(h, 'cheby1', 'MatchExactly', match);

% [EOF]
