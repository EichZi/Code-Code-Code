#Algoritmo Merge Sort (Ordenamiento por mezcla) 
#Complejidad: O(nlogn)

#Método de ordenamiento
def merge_sort(number_list):
  if len(number_list) > 1:
    middle = len(number_list) // 2
    left = number_list[:middle]
    merge_sort(left)
    right = number_list[middle:]
    merge_sort(right)
    number_list.clear()
    
    while left and right:
      if left[0] < right[0]:
        number_list.append(left.pop(0))
      else:
        number_list.append(right.pop(0))
    while left:
      number_list.append(left.pop(0))
    while right:
      number_list.append(right.pop(0))
        
my_list = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
print('Lista actual:')
print(my_list)
merge_sort(my_list)
print('Lista ordenada:')
print(my_list)