<?php
	class xmlAdapter extends Element {
		function __construct($newId, $newType, $newValue) {
			parent::__construct($newId, $newType, $newValue);
		}
		
		public function getString(){
			return '<'.$this->type.' id="'.$this->id.'">'.$this->value.'</'.$this->type.'>'."\n";
		}
	}
?>
