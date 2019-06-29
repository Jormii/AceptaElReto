#include <iostream>

int main()
{
    int numero;
    std::cin >> numero;
    while (numero != 0)
    {
        bool par = (numero & 1) == 0;
        std::cout << ((par) ? "DERECHA\n" : "IZQUIERDA\n");
        std::cin >> numero;
    }
    
    return 0;
}