value = int(input("Digite um número: "))
prev, current = 0, 1
find = False

while current <= value:
    if current == value:
        find = True
        print(f"O número {value} está na sequência de Fibonacci.")
        break
    prev, current = current, prev + current
    
if not find:
    print(f"O número {value} não está na sequência de Fibonacci.")
