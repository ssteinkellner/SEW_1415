<?php
/*
	Name of file  : Test_test.php
	Author        : Steinkellner Sebastian <ssteinkellner@student.tgm.ac.at>
	Version       : 2015.01.15
	Description   : a phpunit test case to test the test.php from the elearning
*/
 
class Test extends PHPUnit_Framework_TestCase {
    public function testZahl() {
		$_GET['zahl'] = 5;
		$this->expectOutputString('Hello World '.$i+42);
		include '../test/';
    }
}

?>