user1 = input("What is Player1's name : ")
user2 = input("what is palyer2's name : ")
while True:
    user1_ans = input(user1 +", do you want to choose rock,paper or scissors? ").lower()
    user2_ans = input(user2 +", do you want to choose rock,paper or scissors ? ").lower()
    if user1_ans == user2_ans:
         print("It's a tie")   
    elif user1_ans=="rock":
        if user2_ans=="scissors":
            print("Rock Wins")
        else:
            print("paper Wins")
    elif user1_ans =="scissors":
        if user2_ans=="paper":
            print("Scissors wins")
        else:
            print("Rock Wins")
    elif user1_ans=="paper":
        if user2_ans=="rock":
            print("Paper Wins")
        else:
            print("Scissors Wins")
    
    else:
         print("Invalid input!you have not entered rock,paper or scissors,try again.")
    repeat = input("Do you want to repeat(Yes/No) ? : ").lower()
    if(repeat =="yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You have Entered Invalid Option.Exiting Now")
        raise SystemExit

        
   
        

    
        
    
        

    
        
    
        

    