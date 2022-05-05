from tkinter import *
from PIL import Image, ImageTk



app = Tk()

#text=dic[0], font=('Times', 100), foreground='White')


image1 = Image.open("./Images/1.png").resize((200,200))
dice1 = ImageTk.PhotoImage(image1)
image2 = Image.open("./Images/2.png").resize((200,200))
dice2 = ImageTk.PhotoImage(image2)
image3 = Image.open("./Images/3.png").resize((200,200))
dice3 = ImageTk.PhotoImage(image3)
image4 = Image.open("./Images/4.png").resize((200,200))
dice4 = ImageTk.PhotoImage(image4)
image5 = Image.open("./Images/5.png").resize((200,200))
dice5 = ImageTk.PhotoImage(image5)
image6 = Image.open("./Images/6.png").resize((200,200))
dice6 = ImageTk.PhotoImage(image6)
image7 = Image.open("./Images/dice.png").resize((200,200))
dice7= ImageTk.PhotoImage(image7)

dic = {
    0 : dice7,
    1 : dice1,
    2 : dice2,
    3 : dice3,
    4 : dice4,
    5 : dice5,
    6 : dice6,
}

dice_result = 0

dice = Label(app, image=dice7)
dice.grid(row=0, column=0, padx=25, pady=5)

def roll():
    from random import randint
    global dice_result
    i = randint(1, 6)
    dice_result = i
    msg = Label(app, image=dic[dice_result],font=('Times', 100), foreground='Black' )
    msg.grid(row=0, column=0, padx=25, pady=5)

roll = Button(app, text='Roll', command=roll)
roll.grid(row=1, column=0)

app.mainloop()