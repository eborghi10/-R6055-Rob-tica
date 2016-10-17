clear all

archivo = fopen('HexapodOutputFile.dat');

% http://www.mathworks.com/help/matlab/ref/textscan.html
A = textscan( archivo, '%s %f' , 'CommentStyle', '%');%, 'Delimiter', '\n' );

for i=1:length(A{:,1})
    S = char(A{1,1}(i));
    switch S
        case 'l1'
            l1 = A{1,2}(i);
        otherwise
            disp('No encontrado');
    end
%    if( strcmp(char(A{1,1}(i)),'l1') )
%        disp(A{1,2}(i));
%        A{1,1}(i) = [];
%        A{1,2}(i) = [];
%        break;
%    end
end

% Cierra el archivo abierto
fclose(archivo);