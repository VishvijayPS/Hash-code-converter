alpha_l =['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
alpha_h =['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
char_sp =['`','~','!','@','#','$','%','^','&','*','(',')','-','_','=','+',';',':','{','}','[',']','|','"',"'",'\\','<',',','>','.','/','?',' ']
numb =['1','2','3','4','5','6','7','8','9','0']

i = 999

j = 1000

s = 700

n = 120

for ele in alpha_h:
    i = i-2
    print(ele," ",i,"\n")

for ele in alpha_l:
    j = j-2
    print(ele," ",j,"\n")

for ele in char_sp:
    s = s - 3
    print(ele," ",s,"\n")

for ele in numb:
    n = n+3
    print(ele," ",n,"\n")