<?php
	class phpAdapter extends Element {
		function __construct($newId, $newType, $newValue) {
			parent::__construct($newId, $newType, $newValue);
		}
		
		public function getString(){
			return '\''.$this->type.'\' => ['."\n"
				."\t".'\'id\' => \''.$this->id.'\','."\n"
				."\t".'\'value\' => \''.$this->value.'\''."\n"
				.']'."\n";
		}
	}
?>
