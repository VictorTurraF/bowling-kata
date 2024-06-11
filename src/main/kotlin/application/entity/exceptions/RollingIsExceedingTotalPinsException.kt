package org.example.application.entity.exceptions

class RollingIsExceedingTotalPinsException :
    Exception("The knocked down pins amount should not be greater then 10 pins")