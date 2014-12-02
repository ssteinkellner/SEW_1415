<?php
	abstract class Element {
		protected $id;
		protected $type;
		protected $value;
		
		function __construct($newId, $newType, $newValue) {
			$this->id = $newId;
			$this->type = $newType;
			$this->value = $newValue;
		}
		
		abstract public function printElement();
	}
?>
