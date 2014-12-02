<?php
	abstract class Element {
		protected $id;
		protected $type;
		protected $value;
		
		function __construct($newId, $newType, $newValue) {
			$id = $newId;
			$type = $newType;
			$value = $newValue;
		}
		
		abstract public function printElement();
	}
?>
