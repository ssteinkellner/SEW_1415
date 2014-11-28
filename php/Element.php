<?php
	abstract class Element {
		$id;
		$type;
		$value;
		
		function __construct($newId, $newType, $newValue) {
			$id = $inewId;
			$type = $newType;
			$value = $newValue;
		}
		
		abstract protected function printElement();
	}
?>
