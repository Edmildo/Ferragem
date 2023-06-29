import tkinter as tk
from tkinter import messagebox

def submit_data():
    name = name_entry.get()
    age = age_entry.get()
    
    if not name or not age:
        messagebox.showerror("Erro", "Por favor, preencha todos os campos.")
    elif not age.isdigit() or int(age) <= 0:
        messagebox.showerror("Erro", "Idade inválida. Por favor, digite um número válido.")
    elif int(age) < 18:
        messagebox.showerror("Erro", "Você deve ter mais de 18 anos.")
    else:
        messagebox.showinfo("Sucesso", f"Nome: {name}\nIdade: {age}")
        # Aqui você pode adicionar o código para realizar alguma ação com os dados submetidos

# Criando a janela principal
window = tk.Tk()
window.title("Formulário")
window.geometry("300x200")

# Criando os rótulos
name_label = tk.Label(window, text="Nome:")
name_label.pack()

age_label = tk.Label(window, text="Idade:")
age_label.pack()

# Criando as entradas de texto
name_entry = tk.Entry(window)
name_entry.pack()

age_entry = tk.Entry(window)
age_entry.pack()

# Criando o botão de submissão
submit_button = tk.Button(window, text="Submeter", command=submit_data)
submit_button.pack()

# Iniciando a janela principal
window.mainloop()
