import os
import sys
import random

def start(): 
   
    yorn = ' '

    while yorn != 'n':
        answer = input('Do you want to play a game? yes[Y] or no[N]: ').lower()
        if answer == 'y':
            thinkof()
        else:
            sys.exit()
        
  
    

def thinkof():
    print(f'Think of a number between 1 and 100')
    input('Press Enter When Ready.')
    computer_guess(100)




def computer_guess(x):
    low = 1
    high = x
    feedback = ' '
    again = ' '

    while feedback != 'c':
        if low != high:
            guess = random.randint(low, high)
        else:
            guess = low #or it could be high b/c low equals high
        feedback = input(f'Is {guess} too high(H), too low(L), or just right(C)?').lower()
        if feedback == 'h':
            high = guess - 1
        elif feedback == 'l':
            low = guess + 1

    print(f'Yay! the computer gueesed {guess} correctly!')
    while again != 'n':
        again = input('Would you like to play again? yes[Y] or n[N]').lower()
        if again == 'y':
            thinkof()
        else:
            sys.exit()


start()
