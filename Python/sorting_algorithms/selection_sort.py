#Algoritmo Selection Sort (Ordenamiento por selección)
#Complejidad: O(n^2)

#Método de ordenamiento
def selection_sort(number_list) :
  for i in range(len(number_list) - 1):
    min_index = i
    for j in range(i + 1, len(number_list)):
      if number_list[j] < number_list[min_index]:
        min_index = j
    temp = number_list[i]
    number_list[i] = number_list[min_index]
    number_list[min_index] = temp
        
my_list = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
print('Lista actual:')
print(my_list)
selection_sort(my_list)
print('Lista ordenada:')
print(my_list)