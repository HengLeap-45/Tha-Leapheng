print("Presenetation and explain about Python code","\n")
print("topic list built in function","\n")

#example about abs or Absolute
num1=-90
print("absolute value ", abs(num1),"\n")

#example about min or mix
num2=[10,30,40,100,60,60]

print("The value of min is",min(num2),"\n")

print("The value of max is",max(num2),"\n")

#example about sum 
print("The value of sum is ",sum(num2),"\n")

# len() គឺជា function ដែលប្រើសម្រាប់ រាប់ចំនួន (length) នៃ object មួយ។
# String (អក្សរ)
# List
# Tuple
# Dictionary
num3="ABCD"
# len use with String
print("The value of len with stirng is ",len(num3),"\n")

#len we use with List
num4=[1,2,3,4,5,6]
print("The value of len  with List is ", len(num4),"\n")


# dictionary គឺជា data type មួយនៅក្នុង Pythonដែលប្រើសម្រាប់ផ្ទុក data ជា key : value ,ហើយពេល​ យើងប្រើជាមួយ len រាប់ជា Item itemស្មើនិង key and value
# Dictionary ប្រើពេល:

# មាន data ជា label
# ចង់រក data លឿន
# data មាន name និង value

# Example:

# student info
# phone contacts
# product info

#  only dictionary
student={
    "name":"Heng",
    "age":"18",
    "class":"420",
}
print (student["name"])
print(student["age"])

# this example about dictionary with len
Student={
    "name":"heng",
    "age":"18",
    "class":"420",
    'gpa':"33.44",
}
print(len(Student))

#len use with tuple 
data=(11,22,33)

print(len(data))

#exaple simple
password=input("Enter your password :")

if len(password) < 8 :
    print("password is short ")
else:
    print("password is correct")

# bool - true or false 
# bool if(o,"",[]) is false , else true
int=0
print(bool(int))
float=12.5
print(bool(float))
String="Heng"
print(bool(String))


# range() គឺជា function ដែលប្រើសម្រាប់បង្កើតលំដាប់លេខ (sequence of numbers)។ វាត្រូវបានប្រើជាញឹកញាប់ជាមួយ for loop ដើម្បីឱ្យកូដដំណើរការច្រើនដង។
# គិតចាប់ពី០ ដល់៥ តែមិនដល់៥ ទេ
for i in range (0,5):
    print(i,"\n")
for i in range (1,6):
    print(i,"\n")

#កើនម្ដង៣ ដោយសារលេខក្រោយ៣
for i in range (1,10,8):
    print(i,"\n")
#ថយចុះម្ដងមួយ ដោយសារលេខក្រោយ១
for i in range(10,1,-2):
    print(i,"\n")

#sorted() រម្រៀប data         
# reverse = true is big to small              
varible=[10,30,40,200]
print(sorted(varible,reverse=True))

#zip use for make group list
# zip(iterable1, iterable2, ...) this is syntax
# zip() គឺជា function ដែលប្រើសម្រាប់ បញ្ចូល (combine) ឬផ្គូផ្គង (pair) ធាតុពី list, tuple ឬ iterable ច្រើនៗ ជាគូៗ តាមលំដាប់ index។
Student=["heng","Leap"]
Score=[90,80]
for S,V in zip(Student,Score):
    print(S,V)

#enumerate() use for loop + index , can use with int and string and don't forget to use value,Sytax :enumerate(iterable, start=0)
# enumerate() មានប្រយោជន៍ខ្លាំងពេលអ្នកត្រូវការ ទាំងលេខទីតាំង (index) និងទិន្នន័យ (value) ក្នុង loop តែមួយ។
Student=['heng','leapheng','sokheng']
for index,value in   enumerate(Student,1):
    print(index,value)

    
# Tuple គឺជា data type មួយនៅក្នុង Python ដែលអាចផ្ទុក values ច្រើនក្នុង variable តែមួយ។
student = ("Sok", 80)
# Tuple នេះមាន 2 values:
("Sok", 80)
# Index 0 → "Sok"
# Index 1 → 80










