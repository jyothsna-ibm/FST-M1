import pandas
from pandas import ExcelWriter

	
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)
Writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(Writer,'Sheet1',index=False)
Writer.save()
 
