<?php
    $sum = 0;
    for ($i = 0; $i <= 10; $i++) {
        if ($i % 2 == 0) {
            $sum += $i;
        }
    }
    echo "$sum";
?>
