package tcas;

public record CollisionPredicition(boolean conflict, double timeToClosestApproach, double closestDistance){}