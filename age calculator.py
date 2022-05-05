from tkinter import *
from datetime import datetime

bg = 'Grey'
fg = 'Black'

app = Tk()
app.title('Age Calculator')

app.geometry('300x150')

msg = Label(app, text='Enter you D.O.B', background=bg, foreground=fg)
msg.grid(row=0, column=0, columnspan=2)

dayL = Label(app, text='Day : ', background=bg, foreground=fg)
dayE = Entry(app, width=2, background=bg, foreground=fg)

monthL = Label(app, text='Month : ', background=bg, foreground=fg)
monthE = Entry(app, width=2, background=bg, foreground=fg)

yearL = Label(app, text='Year : ', background=bg, foreground=fg)
yearE = Entry(app, width=4, background=bg, foreground=fg)

dayL.grid(row=1, column=0)
dayE.grid(row=1, column=1)
monthL.grid(row=1, column=2)
monthE.grid(row=1, column=3)
yearL.grid(row=1, column=4)
yearE.grid(row=1, column=5)

def find_days():
    date = int(dayE.get())
    month = int(monthE.get())
    year = int(yearE.get())
    dob = datetime(day=date, month=month, year=year)

    time_now = datetime.now()
    time_diff = time_now - dob

    dys = Label(app, text='You lived ' + str(time_diff.days) + ' Days!!!', background=bg, foreground=fg)
    dys.grid(row=3,column=0, columnspan=2)

def find_month():
    date = int(dayE.get())
    month = int(monthE.get())
    year = int(yearE.get())
    dob = datetime(day=date, month=month, year=year)

    time_now = datetime.now()
    time_diff = time_now - dob

    months = Label(app, text='You lived ' + str((time_diff.days)/30) + ' Months!!!', background=bg, foreground=fg)
    months.grid(row=5, column=0, columnspan=4)


def find_sec():
    date = int(dayE.get())
    month = int(monthE.get())
    year = int(yearE.get())
    dob = datetime(day=date, month=month, year=year)

    time_now = datetime.now()
    time_diff = time_now - dob

    secs = Label(app, text='You lived '+ str(time_diff.total_seconds()) + ' Seconds!!!', background=bg, foreground=fg)
    secs.grid(row=4, column=0, columnspan=4)

dys = Button(app, text='Total Days', command=find_days, background=bg, foreground=fg)
secs = Button(app, text='Total Seconds', command=find_sec, background=bg, foreground=fg)
months = Button(app, text='Total Months', command=find_month, background=bg, foreground=fg)
months.grid(row=2, column=3, columnspan=2)
dys.grid(row=2, column=0)
secs.grid(row=2, column=1, columnspan=2)

app.mainloop()
