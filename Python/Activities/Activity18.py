import pandas
dataframe = pandas.read_csv(".\sample.csv")
print("Full Data")
print(dataframe)
print(dataframe["Usernames"])
print("username = ",dataframe["Usernames"][1],"|","Password =",dataframe["Passwords"][1])
	
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))