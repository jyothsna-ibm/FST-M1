import pandas
dataframe = pandas.read_excel("./sample.xlsx")
print(dataframe)
print("No of rows and columns:",dataframe.shape)
print("Emails")
print(dataframe['Email'])
print("Sorted Data")
print(dataframe.sort_values("FirstName"))