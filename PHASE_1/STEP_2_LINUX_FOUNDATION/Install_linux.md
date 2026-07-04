# 📝 Notes: Installing Ubuntu using WSL2 (Windows)

## What is WSL2?

**WSL2 (Windows Subsystem for Linux 2)** is a Windows feature that lets you run a **Linux operating system** (such as Ubuntu) directly inside Windows **without installing Linux separately or using a virtual machine**.

**Formula:**
```text
Windows
   ↓
WSL2 (Platform)
   ↓
Ubuntu (Linux OS)
```

* **WSL2** → Provides the environment to run Linux.
* **Ubuntu** → The Linux operating system you will use.

---

# Why do we install Ubuntu?

Many development tools work best on Linux.

Examples:

* Docker
* Git
* Java
* Python
* Node.js
* Kubernetes

Instead of installing Linux separately, we install **Ubuntu inside WSL2**.

---

# Step 1: Open PowerShell as Administrator

### Method 1

1. Press **Windows Key**
2. Search **PowerShell**
3. Right-click **Windows PowerShell**
4. Click **Run as Administrator**

You'll see:

```powershell
Administrator: Windows PowerShell
```

---

# Step 2: Install Ubuntu

Type:

```powershell
wsl --install -d Ubuntu
```

Then press **Enter**.

### Meaning of the command

| Part        | Meaning                                      |
| ----------- | --------------------------------------------- |
| `wsl`       | Runs the Windows Subsystem for Linux command |
| `--install` | Installs WSL and required components         |
| `-d`        | Specifies the Linux distribution to install  |
| `Ubuntu`    | Installs the Ubuntu Linux distribution       |

---

# Step 3: Wait for Installation

Windows downloads and installs:

* WSL2
* Linux Kernel
* Ubuntu

Example output:

```text
Installing: Ubuntu
Downloading...
Installing...
Operation completed successfully.
```

This may take a few minutes depending on your internet speed.

---

# Step 4: Restart Your Computer

After installation, Windows may ask you to restart.

Click **Restart Now** or restart manually.

---

# Step 5: Launch Ubuntu

After restarting:

* Press **Windows Key**
* Search **Ubuntu**
* Open it

The first launch takes a minute or two to finish setup.

---

# Step 6: Create a Username

Ubuntu will display:

```text
Enter new UNIX username:
```

Example:

```text
ragul
```

Press **Enter**.

---

# Step 7: Create a Password

Ubuntu will then ask:

```text
New password:
```

Type a password.

**Note:** You won't see any characters while typing. This is normal in Linux.

Press **Enter**.

Then confirm it:

```text
Retype new password:
```

Press **Enter** again.

---

# Step 8: Installation Complete

You'll see a prompt similar to:

```bash
ragul@DESKTOP-ABC123:~$
```

This means Ubuntu is ready to use.

---

# Step 9: Test Ubuntu

Run these commands:

```bash
pwd
```

Shows the current directory.

```bash
ls
```

Lists files and folders.

```bash
mkdir test
```

Creates a folder named `test`.

```bash
cd test
```

Moves into the `test` folder.

---

# What happens after installation?

```text
Windows
      │
      ├── Windows Apps
      │
      └── WSL2
            │
            └── Ubuntu
                  │
                  ├── Git
                  ├── Java
                  ├── Python
                  ├── Docker
                  └── Node.js
```

Ubuntu provides the Linux environment where you install and run development tools.

---

# Interview Answer

> **WSL2 (Windows Subsystem for Linux 2) is a Windows feature that allows Linux to run on Windows without a virtual machine. We install a Linux distribution such as Ubuntu on top of WSL2. After installation, we create a Linux username and password and can use Linux commands and development tools directly from Windows.**