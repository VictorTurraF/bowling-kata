package org.example.application.entity.exceptions

class RollingIsExceedingTotalPinsException :
    Exception("The total pins amount should not be greater then 10 pins")