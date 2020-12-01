#Algoritmo Insertion Sort (Ordenamiento por inserción)
#Complejidad: O(n^2)

#Método de ordenamiento
def insertion_sort(number_list) :
  for i in range(1, len(number_list)):
    actual_value = number_list[i]
    j = i - 1
    while j >= 0 and actual_value < number_list[j]:
      number_list[j + 1] = number_list[j]
      j = j - 1
    number_list[j + 1] = actual_value
    
my_list = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
print('Lista actual:')
print(my_list)
insertion_sort(my_list)
print('Lista ordenada:')
print(my_list)