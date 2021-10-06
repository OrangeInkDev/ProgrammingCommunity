def BMI(height, weight):
    bmi = weight/(height**2)
    return bmi


height = float(input("Enter height in metres: "))
weight = int(input("Enter weight in kgs: "))

bmi = BMI(height, weight)
print("The BMI status is", format(bmi, ".3f"), "quite ", end='')

if (bmi < 18.5):
    print("underweight")

elif (bmi >= 18.5 and bmi < 24.9):
    print("Healthy")

elif (bmi >= 24.9 and bmi < 30):
    print("overweight")

elif (bmi >= 30):
    print("Suffering from Obesity")
