from tkinter import *

dic = {
    0 : 'Dice',
    1 : '1',
    2 : '2',
    3 : '3',
    4 : '4',
    5 : '5',
    6 : '6',
}

app = Tk()

dice = Label(app, text=dic[0], font=('Times', 100), foreground='White')
dice.grid(row=0, column=0, padx=25, pady=5)

def roll():
    from random import randint
    i = randint(1, 6)
    msg = Label(app, text=dic[i],font=('Times', 100), foreground='Black' )
    msg.grid(row=0, column=0, padx=25, pady=5)

roll = Button(app, text='Roll', command=roll)
roll.grid(row=1, column=1)

app.mainloop()