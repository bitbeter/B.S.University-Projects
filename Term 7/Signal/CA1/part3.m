clc();
clear();
notes();

FS = 16000;
odetojoy();

% createing x with zero
durations=(TD./nd);
SUM = sum(durations * FS);
x=zeros(1,SUM);

now = 1;
for i = 1:length(nd),
   tt= 0 : 1/FS : durations(i);
   xn=(na(i)./(1:10))*sin(2*pi*nf(i)*transpose(1:10)*tt);
   x(now : now + (durations(i) * FS)) = xn.*exp(-tt);
   now = now + (durations(i) * FS);
end
sound(x,FS);
audiowrite('music.wav',x,FS);
