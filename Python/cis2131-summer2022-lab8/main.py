class ElectricVehicle:

    def __init__(self, max_kilowat_hours, current_kilowat_hours, color, make, model, kilometers_per_kilowat_hour):
        self._max_kilowat_hours = max_kilowat_hours
        self._current_kilowat_hours = current_kilowat_hours
        self._color = color
        self._make = make
        self._model = model
        self._kilometers_per_kilowat_hour = kilometers_per_kilowat_hour

    def get_max_kilowat_hours(self):
        return self._max_kilowat_hours

    def get_current_kilowat_hours(self):
        return self._current_kilowat_hours

    def get_color(self):
        return self._color

    def get_make(self):
        return self._make

    def get_model(self):
        return self._model

    def get_kilometers_per_kilowat_hour(self):
        return self._kilometers_per_kilowat_hour

    def charge(self, kilowat_hours_to_charge):
        self._current_kilowat_hours = self._current_kilowat_hours + kilowat_hours_to_charge
        if self._current_kilowat_hours > self._max_kilowat_hours:
            self._current_kilowat_hours = self._max_kilowat_hours

    def drive(self, kilometers_to_drive):
        current_kilowat_hours = self._current_kilowat_hours - kilometers_to_drive/self._kilometers_per_kilowat_hour
        if current_kilowat_hours < 0:
            raise Exception("The car doesn't have enough charge to go that far.")
        else:
            self._current_kilowat_hours = current_kilowat_hours

