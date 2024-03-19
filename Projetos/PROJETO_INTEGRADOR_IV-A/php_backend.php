<?php
// process_form.php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "mydb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

// Prepare and bind
$stmt = $conn->prepare("INSERT INTO myguests (nome, email, telefone, mensagem) VALUES (?, ?, ?, ?)");
$stmt->bind_param("ssss", $nome, $email, $telefone, $mensagem);

// Set parameters and execute
$nome = $_POST['nome'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$mensagem = $_POST['mensagem'];
$stmt->execute();

echo "New record created successfully";

$stmt->close();
$conn->close();
?>
