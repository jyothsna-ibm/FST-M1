def calculate_sum(numbers):
    sum=0
    for number in numbers:
        sum+=number
    return sum
   
num_list=[10,20,30,40]
result = calculate_sum(num_list)
print("The Sum of all elements : "+str(result))