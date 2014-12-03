<?php
	class CLI {
		public function read(){
			return trim(fgets(STDIN));
		}
	}
?>
