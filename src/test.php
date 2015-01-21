<?php
/*
	Name of file  : test.php
	Author        : Steinkellner Sebastian <ssteinkellner@student.tgm.ac.at>
	Version       : 2015.01.15
	Description   : a test programm to be used in a unittest
*/
function test($i) { return $i+42; };
$test = test($_GET['zahl']);
echo „Hello World $test“;
?>