<?php
	abstract class Element {
		protected $id;
		protected $type;
		protected $value;
		
		function __construct($id, $type, $value) {
			$this->id = $id;
			$this->type = $type;
			$this->value = $value;
		}
		
		abstract public function getString();
	}
?>
