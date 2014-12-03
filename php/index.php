<?php
	if(count($argv)!=5){
		echo 'Usage: php [...].php <server ip> <database name> <username> <password>';
		return;
	}
//	var_dump($argv);
	
	$err='';
	$link = mysqli_connect('localhost', 'insy4', 'blabla', 'premiere');
	if (!$link) {
		$err .= 'MySQL Error: ' . mysqli_connect_errno() . "<br>\n";
	}else{
		include_once('./Factory.php');
		include_once('./CLI.php');$line = '';
		
		$exitCmd = 'exit';
		echo 'Welcome!'."\n".'to end programm type \''.$exitCmd.'\''."\n".'to get help type \'help\''."\n";
		while(strtolower($line)!=$exitCmd){
			echo ' > ';
			$line = CLI::read();
			CLI::action($line);
		}
		
		mysqli_close($link);
	}
	if(!empty($err)){
		echo 'ERRORS:'."\n".$err;
	}
?>