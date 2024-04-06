<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
</head>
<body>
<h2> Sign Up</h2>
	<form >
	<label >Name:</label><br>
        <input type="text" id="name" name="name" placeholder="Enter your Name"required><br><br>

        <label >Email:</label><br>
        <input type="email" id="email" name="email"placeholder="Enter your Email Id" required><br><br>

        <label >Password:</label><br>
        <input type="password" id="password" name="Enter Password" minlength="8" placeholder="Min characters 8" required ><br><br>

        <label >Confirm Password:</label><br>
        <input type="password" id="confirm_password" name="confirm_password" minlength="8"placeholder="Min characters 8" required ><br><br>

        <label >Date Of Birth:</label><br>
        <input type="text" id="dob" name="dob" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="dd/mm/yyyy" required><br><br>

        <label >Gender:</label><br>
        <input type="radio" name = "Male" value=".."> Male
        <input type="radio" name = "Female" value="..">Female
        <input type="radio" name = "Others" value="..">Others</br></br>

        <label >Insert your photo:</label><br>
        <input type="file" id="photo" name="photo"><br><br>

        <label >Insert your resume:</label><br>
        <input type="file" id="resume" name="resume"><br><br>

        <label >Security Question:</label><br>
        <select id="security_question" name="security_question" required>
            <option value="select">Select</option>
            <option value="select">What is the place you were born?</option>
            <option value="select">What is your pet name?</option>
            <option value="select">              </option>

                    </select><br><br>

        <input type="checkbox" id="terms_conditions" name="terms_conditions" required>
        <label >I agree to terms and conditions</label><br><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>
