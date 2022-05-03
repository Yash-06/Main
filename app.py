from tkinter import *
from random import choice, sample



"""def display():
    msg = Label(app, text=randint(1,100))
    msg.grid()
    print("Hello, Welcome to the application windows")"""

app = Tk()
app.title("Element Picker")
app['background'] = 'white'
inp = Entry(app, background='grey', relief='raised', borderwidth=3, width=25)
inp.grid(row=0, column=0, columnspan=2, padx=20, pady=5)


def pick():
    INP = (inp.get()).split(',')

    if no_of_choice.get() != 1:
        ele = sample(INP, no_of_choice.get())
        lbl = ''
        for e in ele:
            lbl += ' ' + e
        chois = 'Choice : '+str(lbl)
    else:
        chois = 'Choice : ' + str(choice(INP))

    Outwind = Toplevel()
    Outwind.title('Output')

    msg = Label(Outwind, text=chois, relief='raised', width=25 , borderwidth=4, font=('Courier', 10))
    msg.grid(row=2, column=0, columnspan=2, padx=25, pady=5)
    if quitB['state'] == DISABLED:
         quitB['state'] = NORMAL


app.geometry('300x250')
B = Button(app, text='choose', command=pick, relief='groove', borderwidth=5)
B.grid(row=1, column=0,padx=25, pady=5)

quitB = Button(app, text='Cancel', command=app.quit, state=DISABLED,borderwidth=5, background='red')
quitB.grid(row=1, column=1,padx=25, pady=5)

no_of_choice = IntVar()

check = StringVar()
"""chk = Checkbutton(app, text='Double', variable=no_of_choice, onvalue=2, offvalue=1)
chk.deselect()
chk.grid(row=3, column=0, columnspan=2,padx=25, pady=5)"""

def show():
    msg = Label(app, text=check.get())
    msg.grid()


"""rb1 = Radiobutton(app, text='1', variable=no_of_choice, value=1)
rb2 = Radiobutton(app, text='2', variable=no_of_choice, value=2)
rb1.deselect()
rb2.deselect()
rb1.grid()
rb2.grid()"""

sld = Scale(app, from_=0, to=5, variable=no_of_choice, orient=HORIZONTAL)
sld.grid()

B = Button(app, text='show', command=show)
B.grid()



app.mainloop()
