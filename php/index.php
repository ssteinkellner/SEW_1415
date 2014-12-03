<?php
	if(count($argv)!=5){
		echo 'Usage: php [...].php <ServerIp> <Databases> <Username> <Password>';
		return;
	}
	var_dump($argv);
	
	include_once('./Factory.php');
	include_once('./CLI.php');
	
	$line = '';
	$exitCmd = 'exit';
	echo 'Welcome!'."\n".'to end programm type \''.$exitCmd.'\''."\n";
	while(strtolower($line)!=$exitCmd){
		echo ' > ';
		$line = CLI::read();
		action($line);
	}
	
	
	function action($line){
		$input = explode(' ',$line);
		if(count($input)<=0){ return; }
		switch($input[0]){
			case 'create':
				if(count($input)<=1){ return; }
				$factory = new Factory($input[1]);
				$adapter = $factory->createElement(1,'user','test');
				echo $adapter->getString();
				break;
		}
	}
	
	function askDB($query){
		$values;
		
		return $values;
	}
?>