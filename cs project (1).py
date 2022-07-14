#sign in window to sky castle library's website
print("welcome to sky castle")
while True:
    try:
        choice1=int(input('''1. log in
2.new
enter 1 or 2:'''))
        if choice1!=1 and choice1!=2:
            print('please choose 1 or 2')
        if choice1==1:
            username1=input("Enter your username: ")
            password1=input("Enter your password: ")
            name=input('Enter Your name: ')
            f=open('get.txt','w')
            f.writeline(username1)
            f.writeline(password1)
            f.writeline(name)
            f.close()
            break
        if choice1==2:
            name=input('Enter Your name: ')
            username1=input("Enter your username: ")
            password1=input('Enter your password: ')
            f=open('get.txt','w')
            f.writelines(username1)
            f.writelines(password1)
            f.writelines(name)
            f.close()
            break
    except ValueError:
            print('enter 1 or 2 only')


#main menu window
print ("main menu")#will appear as a menu bar (this is a sample)
print("What is Sky castle Library?") #inside the main menu page
print('Our goal is to provide a page on the web for every book')
print('ever published. at its heart, Sky castle Library is a catalog.')
print('The project began in November 2020 and has been inhaling')
print('catalog records from some of the biggest libraries in')
print('the world ever since.')

#books lists page (on the menu bar) and contains 5 books
while True:
    try:
        choice=int(input("""1.overdose
2. 20 minutes
3. promise neverland
4. Harry potter
5. kill me heal me
choose your book:"""))
        price1=30
        price2=70
        price3=60
        price4=30
        price5=30
        if choice==1:
                print("name of the book: overdose")
                print("genre: romantic and melodrama")
                print('price:',price1,"$")
                print('author:Light')
                break
        elif choice ==2:
            print("name of the book: 20 minutes")
            print("genre: self improvement")
            print('price:',price2,"$")
            print("author:Eso")
            break
        elif choice ==3:
            print("name of the book: promise neverland ")
            print("genre: action and mystery")
            print('price:',price3,'$')
            print('author:Moon')
            break
        elif choice ==4:
            print("name of the book: Harry potter")
            print("genre: mystery")
            print('price:',price4,"$")
            print("author:Cardi b ")
            break
        elif choice ==5:
            print("name of the book: kill me heal me")
            print("genre: comedy and medical")
            print('price:',price5,"$")
            print("author:Ji Sung")
            break
        else:
            print("please choose a book from 1 to 5")
            pass 
        
    except ValueError:
            print('enter a number')

            break
#user info window
while True:
    try:
        choice3=int(input("""1.inside KSA
2.outside KSA
Choose your location:"""))
        if choice3==1:
            payment=int(input("""1.payment on delivery
2.credit card
choose your payment method"""))
            if payment==1:
                if choice==1:
                    print("your total=",price1+10,"$")
                    break
                elif choice==2:
                    print("your total=",price2+10,"$")
                    break
                elif choice==3:
                    print("your total=",price3+10,"$")
                    break
                elif choice==4:
                    print("your total=",price4+10,"$")
                    break
                elif choice==5:
                    print("your total=",price5+10,"$")
                    break
        
            elif payment==2:
                if choice==1:
                    print('your total is=',price1,'$')
                    break
                elif choice==2:
                    print('your total is=',price2,'$')
                    break
                elif choice==3:
                    print('your total is=',price1,'$')
                    break
                elif choice==4:
                    print('your total is=',price1,'$')
                    break
                elif choice==5:
                    print('your total is=',price5,'$')
                    break
                
        elif choice3==2:
            print("credit card")
            tax=20
            if choice==1:
                print('your total is=',price1+tax,'$')
                break
            elif choice==2:
                print('your total is=',price2+tax,'$')
                break
            elif choice==3:
                print('your total is=',price1+tax,'$')
                break
            elif choice==4:
                print('your total is=',price1+tax,'$')
                break
            elif choice==5:
                print('your total is=',price5+tax,'$')
                break

        else:
            print('please choose from choices')
                        
    except ValueError:
        print('please enter an int choice')



print('your order has been added successfully')
print('thank you for ordering from sky castle')


#msgbox
