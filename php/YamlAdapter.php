<?php
	class yamlAdapter extends Element {
		function __construct($newId, $newType, $newValue) {
			parent::__construct($newId, $newType, $newValue);
		}
		
		public function printElement(){
			echo $this->type.':'."\n"
				."\t".'id: '.$this->id."\n"
				."\t".'value: '.$this->value."\n";
		}
	}
?>
