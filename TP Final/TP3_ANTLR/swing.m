function [ x, y, z ] = swing(t, dt, P1, P2, h)

    % Esta funci�n realiza una trayectoria CICLOIDEA cuando gira.
    % Cicloide: Curva generada por un punto perteneciente a una 
    %           circunferencia generatriz al rodar sobre una l�nea recta
    %           directriz, sin deslizarse.

    % X
    ax = (P2(1) - P1(1)) / 2;
    nx = (P2(1) + P1(1)) / 2;
    
    x = nx - ax * cos(t/dt * pi);
    
    % Y
    ay = (P2(2) - P1(2)) / 2;
    ny = (P2(2) + P1(2)) / 2;
    
    y = ny - ay * cos(t/dt * pi);
    
    % Z    
    z = h/2 * (1 - cos(t/dt * 2*pi)) + (P2(3) - P1(3))*t/dt;
end